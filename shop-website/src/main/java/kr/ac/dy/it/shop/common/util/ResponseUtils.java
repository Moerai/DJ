package kr.ac.dy.it.shop.common.util;

import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.FileCopyUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLConnection;

/**
 * Created by PARK on 2017-02-08.
 */
@Slf4j
public class ResponseUtils {

	//private static final Logger logger = LoggerFactory.getLogger(ResponseUtils.class);

	private static final String HTML_TITLE = "TITLE";
	private static final String HTML_TEMPLATE_1 = "<!doctype html><html lang=\"ko\"><head><title>" + HTML_TITLE + "</title><script>%s</script></head><body>%s</body></html>";

	public static void responseHtml(HttpServletResponse response, String script) {
		responseHtml(response, script, "");
	}

	public static void responseHtml(HttpServletResponse response, String script, String body) {
		try {
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");

			PrintWriter printWriter = response.getWriter();
			printWriter.write(String.format(HTML_TEMPLATE_1, script, body));
			printWriter.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static String getResponseHtmlByAlertAndHistoryback(String msg) {
		String script = String.format(JS_ALERT, msg) + JS_HISTORYBACK;
		return String.format(HTML_TEMPLATE_1, script, "");
	}

	private static final String JS_HISTORYBACK = "history.back();";
	private static final String JS_ALERT = "alert(\"%s\");";
	private static final String JS_LOCATION = "location.href = \"%s\";";

	public static void htmlAlert(HttpServletResponse response, String msg) {
		String script = String.format(JS_ALERT, msg);
		responseHtml(response, script);
	}

	public static void htmlLocation(HttpServletResponse response, String url) {
		String script = String.format(JS_LOCATION, url);
		responseHtml(response, script);
	}

	public static void htmlAlertAndHistoryback(HttpServletResponse response, String msg) {
		String script = String.format(JS_ALERT, msg) + JS_HISTORYBACK;
		responseHtml(response, script);
	}

	public static void htmlAlertAndLocation(HttpServletResponse response, String msg, String url) {
		String script = String.format(JS_ALERT, msg) + String.format(JS_LOCATION, url);
		responseHtml(response, script);
	}

	public static void responseJson(HttpServletResponse response, String json) {
		try {
			response.setCharacterEncoding("utf-8");
			response.setContentType("application/json;charset=utf-8");

			PrintWriter printWriter = response.getWriter();
			printWriter.write(json);
			printWriter.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void responseJsonFailMessage(HttpServletResponse response, String message) {

		JsonObject header = new JsonObject();
		header.addProperty("result", false);
		header.addProperty("resultCode", 0);
		header.addProperty("message", message);

		JsonObject json = new JsonObject();
		json.add("header", header);
		json.add("body", null);

		responseJson(response, json.toString());
	}

	public static void responsePlist(HttpServletResponse response, String text) {

		try {
			response.setCharacterEncoding("utf-8");
			response.setContentType("application/x-plist;charset=utf-8");

			PrintWriter printWriter = response.getWriter();
			printWriter.write(text);
			printWriter.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void fileDownload(HttpServletResponse response, String filePath) throws Exception {

		File file = new File(filePath);
		if (!file.exists()) {
			throw new Exception(" 요청하신 파일이 존재하지 않습니다. ");
		}

		String mimeType = URLConnection.guessContentTypeFromName(file.getName());
		if (mimeType == null) {
			System.out.println("mimetype is not detectable, will take default");
			mimeType = "application/octet-stream";
		}
		response.setContentType(mimeType);

        /* "Content-Disposition : inline" will show viewable types [like images/text/pdf/anything viewable by browser] right on browser
			while others(zip e.g) will be directly downloaded [may provide save as popup, based on your browser setting.]*/
		response.setHeader("Content-Disposition", String.format("inline; filename=\"" + file.getName() + "\""));

        /* "Content-Disposition : attachment" will be directly download, may provide save as popup, based on your browser setting*/
		//response.setHeader("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getName()));

		response.setContentLength((int) file.length());

		InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
		FileCopyUtils.copy(inputStream, response.getOutputStream());
	}

}
