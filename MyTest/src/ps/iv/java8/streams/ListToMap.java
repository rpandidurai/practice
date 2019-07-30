package ps.iv.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {
		
		List<Template> tList = Arrays.asList(
			new Template(1l, "Obj 1"), new Template(2l, "Obj 2")
		);
		
		Map<Long, Template> tMap = tList.stream().collect(Collectors.toMap(Template::getId, t -> t));
		
		System.out.println(tMap);
	}

}


class Template
{
	private long id;
	private String name;
	
	public Template(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + " " + this.getName();
	}
}