package model.dto;
import lombok.*;

@Getter 
@Setter
@ToString 
@Builder
@NoArgsConstructor 
@AllArgsConstructor

public class BoardDto {
	private int bno;
	private String btitle;
	private String bcontent;
	private String bfile;
	private String bdate;
    private int bview;
    private int mno;
    private int bcno;
    //테이블 이외 필드
    private String mid;
    private String bcname;
}
