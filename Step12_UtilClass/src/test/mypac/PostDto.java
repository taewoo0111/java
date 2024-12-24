package test.mypac;

public class PostDto {
	private int num;
	private String name;
	private String head;
	
	public PostDto() {}
	
	public PostDto(int num, String name, String head) {
		this.num = num;
		this.name = name;
		this.head = head;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	
	
}
