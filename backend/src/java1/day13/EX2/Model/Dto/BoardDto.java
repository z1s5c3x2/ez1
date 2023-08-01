package java1.day13.EX2.Model.Dto;

public class BoardDto {
    private String writer;
    private String content;
    private int viewCount;
    private String title;
    
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public BoardDto() {
		// TODO Auto-generated constructor stub
	}
	public BoardDto(String writer, String content) {
		super();
		this.writer = writer;
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "BoardDto [writer=" + writer + ", content=" + content + ", viewCount=" + viewCount + ", title=" + title
				+ "]";
	}
	public BoardDto(String writer, String content, String title) {
		super();
		this.writer = writer;
		this.content = content;
		this.title = title;
	}
	

}
