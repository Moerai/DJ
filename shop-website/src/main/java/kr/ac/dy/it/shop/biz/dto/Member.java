package kr.ac.dy.it.shop.biz.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode

public class Member {

    String userId;
    String password;
    String userName;
    String userGender;
    String userEmile;

}