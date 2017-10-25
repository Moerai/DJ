package kr.ac.dy.it.shop.biz.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class InputLog {

	String snsType;
	String eventType;
	String sharedInfo;

}
