package kr.ac.kopo.moviereview.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Table(name = "m_member")
public class Member extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 1씩 증가되는 자동증가 기능 추가
    private Long mid;

    private String email;
    private String pw;
    private String nickname;
}
