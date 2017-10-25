package kr.ac.dy.it.shop.biz.model;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class PageVO<T> {

    List<T> list;
    int totalCount;
    String pageString;


    public void setPageValue(List<T> list, int totalCount) {
        this.list = list;
        this.totalCount = totalCount;
    }


}
