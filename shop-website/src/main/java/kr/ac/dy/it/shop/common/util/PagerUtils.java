package kr.ac.dy.it.shop.common.util;

import java.util.HashMap;

public class PagerUtils {

    final static String IMG_FIRST = "/images/cms/btn_pprev.gif";
    final static String ALT_FIRST = "처음";
    final static String IMG_PREVIOUS = "/images/cms/btn_prev.gif";
    final static String ALT_PREVIOUS = "이전";
    final static String IMG_NEXT = "/images/cms/btn_next.gif";
    final static String ALT_NEXT = "다음";
    final static String IMG_LAST = "/images/cms/btn_nnext.gif";
    final static String ALT_LAST = "마지막";

    final public static int DEFAULT_PAGE_BLOCK = 10;

    private boolean isPrevPage;        //이전페이지 존재여부
    private boolean isNextPage;        //다음페이지 존재여부
    protected int nowPage;            //현재페이지
    protected int rowTotal;            //총 게시물수
    protected int blockList;        //한페이지에 표시될 리스트수
    protected int blockPage;        //한 블럭에 표시될 페이지수
    protected int blockSize;
    private int totalPage;            //전체페이지수
    private int startPage;            //시작페이지
    private int endPage;            //마지막 페이지
    private int startRow;            //데이타베이스의 쿼리에서 사용할 시작값
    private int endRow;                //데이타베이스의 쿼리에서 사용할 종료값
    private int startNum;            //리스트 표기시 처음 시작 숫자

	/*
    * 페이지를 계산하는 생성자
	* nowPage : 현재페이지
	* rowTotal : 총게시물수
	* blockList : 한페이지에 디스플레이될 게시물수
	* blockPage: 한 블럭에 표시될 페이지수
	*/
	/*public PagerUtils(int nowPage, int rowTotal, int blockList) {
		initialize(nowPage, rowTotal, blockList, PagerUtils.DEFAULT_PAGE_BLOCK);
	}*/

    public PagerUtils(int nowPage, int rowTotal, int blockList, int blockPage) {
        initialize(nowPage, rowTotal, blockList, blockPage);
    }

    public PagerUtils(int page, int size, int totalCount) {
        initialize(page, totalCount, size, PagerUtils.DEFAULT_PAGE_BLOCK);
    }

	/*
	public PagerUtils(SearchParameter searchParameter, int rowTotal) {
		initialize(searchParameter.getPage(), rowTotal, searchParameter.getSize(), PagerUtils.DEFAULT_PAGE_BLOCK);
	}
	*/

    private void initialize(int nowPage, int rowTotal, int blockList, int blockPage) {

        //super();

        this.nowPage = nowPage;
        this.rowTotal = rowTotal;
        this.blockList = blockList;
        this.blockPage = blockPage;

        // 각종 플래그를 초기화
        isPrevPage = false;
        isNextPage = false;

        // 입력된 전체 열의 수를 통해 전체 페이지 수를 계산한다
        this.totalPage = (int) Math.ceil((double) rowTotal / (double) blockList);

        // 현재 페이지가 전체 페이지수보다 클경우 전체 페이지수로 강제로 조정한다
        if (nowPage > this.totalPage) nowPage = this.totalPage;

        //상기와 같을경우 totalPage가 0이고 nowPage가 1일경우 에러발생
        if (nowPage < 1) nowPage = 1;

        // DB입력을 위한 시작과 종료값을 구한다
        this.startRow = (nowPage - 1) * blockList;
        this.endRow = this.startRow + blockList - 1;

        // 시작페이지와 종료페이지의 값을 구한다
        this.startPage = ((nowPage - 1) / blockPage) * blockPage + 1;
        this.endPage = this.startPage + blockPage - 1;

        //리스트의 최상의 숫자를 구한다.
        this.startNum = rowTotal - (blockList * (nowPage - 1));//리스트될 경우 최상위 숫자


        // 마지막 페이지값이 전체 페이지값보다 클 경우 강제 조정
        if (this.endPage > this.totalPage) {
            this.endPage = totalPage;
        }

        // 시작 페이지가 1보다 클 경우 이전 페이징이 가능한것으로 간주한다
        if (this.startPage > 1) {
            this.isPrevPage = true;
        }

        // 종료페이지가 전체페이지보다 작을경우 다음 페이징이 가능한것으로 간주한다
        if (this.endPage < this.totalPage) {
            this.isNextPage = true;
        }

        // 기타 값을 저장한다
        this.nowPage = nowPage;
        this.rowTotal = rowTotal;
        this.blockList = blockList;
        this.blockPage = blockPage;
    }

    public void Debug() {
        System.out.println("input : nowPage :" + this.nowPage + " / rowTotal : " + this.rowTotal + " / blockList : " + this.blockList + " / blockPage : " + this.blockPage + " / totalPage : " + this.totalPage);
        System.out.println("Total Page : " + this.totalPage + " / Start Page : " + this.startPage + " / End Page : " + this.endPage);
        System.out.println("Total Row : " + this.rowTotal + " / Start Row : " + this.startRow + " / End Row : " + this.endRow);
    }

    // 전체 페이지 수를 알아온다
    public int getTotalPage() {
        return totalPage;
    }

    // 시작 Row값을 가져온다
    public int getStartRow() {
        return startRow;
    }

    // 마지막 Row값을 가져온다
    public int getEndRow() {
        return endRow;
    }

    // Block Row 크기를 가져온다
    public int getBlockSize() {
        return blockSize;
    }

    // 시작페이지값을 가져온다
    public int getStartPage() {
        return startPage;
    }

    // 마지막 페이지값을 가져온다
    public int getEndPage() {
        return endPage;
    }

    // 이전페이지의 존재유무를 가져온다
    public boolean isPrevPage() {
        return isPrevPage;
    }

    // 다음페이지의 존재유무를 가져온다
    public boolean isNextPage() {
        return isNextPage;
    }

    // 리스트 표기시 처음 시작 숫자를 가져온다.
    public int getStartNum() {
        return startNum;
    }

    public HashMap<String, String> getParams() {

        HashMap<String, String> params = new HashMap<String, String>();
        params.put("isPrevPage", new Boolean(isPrevPage).toString());
        params.put("isNextPage", new Boolean(isNextPage).toString());

        params.put("nowPage", Integer.toString(nowPage));
        params.put("rowTotal", Integer.toString(rowTotal));
        params.put("blockList", Integer.toString(blockList));
        params.put("blockPage", Integer.toString(blockPage));
        params.put("blockSize", Integer.toString(blockSize));
        params.put("totalPage", Integer.toString(totalPage));
        params.put("startPage", Integer.toString(startPage));
        params.put("endPage", Integer.toString(endPage));
        params.put("startRow", Integer.toString(startRow));
        params.put("endRow", Integer.toString(endRow));
        params.put("startNum", Integer.toString(startNum));
        return params;
    }

    public String printPage() {
        return printPage("");
    }


    public String printPage(String parameter) {

        StringBuffer sb = new StringBuffer();

        sb.append("<ul>");

        sb.append(String.format("<li><a href='?pageIndex=%d%s'><img src='%s' alt='%s'/></a></li>", 1, parameter, IMG_FIRST, ALT_FIRST));

        if (isPrevPage) {
            sb.append(String.format("<li><a href='?pageIndex=%d%s'><img src='%s' alt='%s'/></a></li>", nowPage - 1, parameter, IMG_PREVIOUS, ALT_PREVIOUS));
        } else {
            sb.append(String.format("<li><a href='#'><img src='%s' alt='%s'/></a></li>", IMG_PREVIOUS, ALT_PREVIOUS));
        }

        for (int i = startPage; i <= endPage; i++) {
            if (i > startPage) {
                sb.append(" ");
            }

            if (nowPage == i) {
                sb.append(String.format("<li class='on'><a href='#'>%d</a></li>", i));
            } else {
                sb.append(String.format("<li><a href='?pageIndex=%d%s'>%d</a></li>", i, parameter, i));
            }
        }

        if (isNextPage) {
            sb.append(String.format("<li><a href='?pageIndex=%d%s'><img src='%s' alt='%s'/></a></li>", endPage + 1, parameter, IMG_NEXT, ALT_NEXT));
        } else {
            sb.append(String.format("<li><a href='#'><img src='%s' alt='%s'/></a></li>", IMG_NEXT, ALT_NEXT));
        }

        sb.append(String.format("<li><a href='?pageIndex=%d%s'><img src='%s' alt='%s'/></a></li>", totalPage, parameter, IMG_LAST, ALT_LAST));

        sb.append("</ul>");

        return sb.toString();
    }

    public String printPage2(String parameter) {

        StringBuffer sb = new StringBuffer();

        sb.append("<div class=\"paging\">");

        sb.append(String.format("<a href='?pageIndex=%d%s'><img src='%s' alt='%s'/></a>", 1, parameter, IMG_FIRST, ALT_FIRST));

        if (isPrevPage) {
            sb.append(String.format("<a class=\"pim\" href='?pageIndex=%d%s'><img src='%s' alt='%s'/></a>", nowPage - 1, parameter, IMG_PREVIOUS, ALT_PREVIOUS));
        } else {
            sb.append(String.format("<a class=\"pim\" href='#'><img src='%s' alt='%s'/></a>", IMG_PREVIOUS, ALT_PREVIOUS));
        }

        for (int i = startPage; i <= endPage; i++) {
            if (i > startPage) {
                sb.append(" ");
            }

            if (nowPage == i) {
                sb.append(String.format("<a href='#' class='this'>%d</a>", i));
            } else {
                sb.append(String.format("<a href='?pageIndex=%d%s'>%d</a>", i, parameter, i));
            }
        }

        if (isNextPage) {
            sb.append(String.format("<a class=\"pim2\" href='?pageIndex=%d%s'><img src='%s' alt='%s'/></a>", endPage + 1, parameter, IMG_NEXT, ALT_NEXT));
        } else {
            sb.append(String.format("<a class=\"pim2\" href='#'><img src='%s' alt='%s'/></a>", IMG_NEXT, ALT_NEXT));
        }

        sb.append(String.format("<a href='?pageIndex=%d%s'><img src='%s' alt='%s'/></a>", totalPage, parameter, IMG_LAST, ALT_LAST));

        sb.append("</div>");

        return sb.toString();
    }

	/*
	<div class="paging">
			<a href="#" title="Prev" class="pv prev"></a>
			<a href="#" class="on">1</a>
			<a href="#">2</a>
			<a href="#">3</a>
			<a href="#">4</a>
			<a href="#">5</a>
			<a href="#" title="Next" class="pv next"></a>
		</div>
	 */

    public String printPage3(String parameter) {

        if (rowTotal < 1) {
            return StringUtils.Empty;
        }

        StringBuffer sb = new StringBuffer();

        sb.append("<div class=\"paging\">");

        sb.append(String.format("<a class='pv first' title='First' href='?page=%d%s'></a>", 1, parameter));

        if (isPrevPage) {
            sb.append(String.format("<a class='pv prev' title='Previous' href='?page=%d%s'></a>", nowPage - 1, parameter));
        } else {
            sb.append(String.format("<a class='pv prev' title='Previous' href='#'></a>"));
        }

        for (int i = startPage; i <= endPage; i++) {
            if (i > startPage) {
                sb.append(" ");
            }

            if (nowPage == i) {
                sb.append(String.format("<a href='#' class='on'>%d</a>", i));
            } else {
                sb.append(String.format("<a href='?page=%d%s'>%d</a>", i, parameter, i));
            }
        }

        if (isNextPage) {
            sb.append(String.format("<a class=\"pv next\" title='Next' href='?page=%d%s'></a>", endPage + 1, parameter));
        } else {
            sb.append(String.format("<a class=\"pv next\" title='Next' href='#'></a>"));
        }

        sb.append(String.format("<a class='pv last' title='Last' href='?page=%d%s'></a>", totalPage, parameter));

        sb.append("</div>");

        return sb.toString();
    }


    /*
        <div class="co-table-nav">
            <ul>
                <li class="first"></li>
                <li class="prev"></li>
                <li class="on">1</li>
                <li>2</li>
                <li>3</li>
                <li>4</li>
                <li>5</li>
                <li>6</li>
                <li>7</li>
                <li>8</li>
                <li>9</li>
                <li>10</li>
                <li class="next"></li>
                <li class="last"></li>
            </ul>
        </div>


     */
    public String printPage4(String parameter) {

        if (rowTotal < 1) {
            return StringUtils.Empty;
        }

        StringBuffer sb = new StringBuffer();

        sb.append("<div class=\"co-table-nav mb100\">");
        sb.append("\r\n");
        sb.append("<ul>");

        sb.append(String.format("<li class='first'><a href='?pageIndex=%d%s'></a></li>", 1, parameter));
        sb.append("\r\n");

        if (isPrevPage) {
            sb.append(String.format("<li class='prev'><a href='?pageIndex=%d%s'></a></li>", nowPage - 1, parameter));
        } else {
            sb.append(String.format("<li class='prev'><a href='#'></a></li>"));
        }
        sb.append("\r\n");

        for (int i = startPage; i <= endPage; i++) {
            if (i > startPage) {
                sb.append(" ");
            }

            if (nowPage == i) {
                sb.append(String.format("<li class='on'>%d</li>", i));
            } else {
                sb.append(String.format("<li><a href='?pageIndex=%d%s'>%d</a></li>", i, parameter, i));
            }
            sb.append("\r\n");
        }

        if (isNextPage) {
            sb.append(String.format("<li class='next'><a href='?pageIndex=%d%s'></a></li>", endPage + 1, parameter));
        } else {
            sb.append(String.format("<li class='next'><a href='#'></a></li>"));
        }
        sb.append("\r\n");

        sb.append(String.format("<li class='last'><a href='?pageIndex=%d%s'></a></li>", totalPage, parameter));
        sb.append("\r\n");

        sb.append("</ul>");
        sb.append("\r\n");
        sb.append("</div>");

        return sb.toString();
    }

	/*
	public String printPageMiddleType(String parameter, SearchParameter param) {

		String searchBoardMiddleType = StringUtils.getString(param.getSearch .getSearchBoardMiddleType());
		String searchCategoryCode = StringUtils.getString(param.getSearchCategoryCode());
		StringBuffer sb = new StringBuffer();

		sb.append("<ul>");

		sb.append(String.format("<li><a href='?pageIndex=%d%s&searchBoardMiddleType=" + searchBoardMiddleType + "'><img src='/res/images/common/first.png'  alt='맨앞으로'/></a></li>", 1, parameter));

		if (isPrevPage) {
			sb.append(String.format("<li><a href='?pageIndex=%d%s&searchBoardMiddleType=" + searchBoardMiddleType + "'><img src='/res/images/common/prev.png' alt='이전으로'/></a></li>", nowPage - 1, parameter));
		} else {
			sb.append(String.format("<li><a href='#'><img src='/res/images/common/prev.png' alt='이전으로'/></a></li>"));
		}

		for (int i = startPage; i <= endPage; i++) {
			if (i > startPage) {
				sb.append(" ");
			}

			if (nowPage == i) {
				sb.append(String.format("<li class='on'><a href='#'>%d</a></li>", i));
			} else {
				sb.append(String.format("<li><a href='?pageIndex=%d%s&searchBoardMiddleType=" + searchBoardMiddleType + "'>%d</a></li>", i, parameter, i));
			}
		}

		if (isNextPage) {
			sb.append(String.format("<li><a href='?pageIndex=%d%s&searchBoardMiddleType=" + searchBoardMiddleType + "'><img src='/res/images/common/next.png' alt='다음으로'/></a></li>", endPage + 1, parameter));
		} else {
			sb.append(String.format("<li><a href='#'><img src='/res/images/common/next.png' alt='다음으로'/></a></li>"));
		}

		sb.append(String.format("<li><a href='?pageIndex=%d%s&searchBoardMiddleType=" + searchBoardMiddleType + "'><img src='/res/images/common/last.png' alt='맨뒤로'/></a></li>", totalPage, parameter));

		sb.append("</ul>");

		return sb.toString();
	}
	*/
}