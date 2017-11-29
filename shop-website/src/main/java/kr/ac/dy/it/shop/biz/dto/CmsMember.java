package kr.ac.dy.it.shop.biz.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode

public class CmsMember {

    String id;
    String pw;
    String name;
}