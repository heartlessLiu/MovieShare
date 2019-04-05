import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<User> users=new ArrayList<>();
		users.add(new User("张三","111",25));
		users.add(new User("鲁班","23",60));
		users.add(new User("阿斯顿","21321",70));
		users.add(new User("虚","21321",22));
		users.add(new User("释放","21321",18));
		users.add(new User("锋","23",5));
		users=users.stream().filter((x) -> {if(x.getAge()>25) return true; else return false;}).collect(Collectors.toList());
		/*Collections.sort(users, (x,y) -> { 
			return Integer.compare(x.getAge(), y.getAge());
		});*/
		
		
		
		for (User user : users) {
			System.out.println(user.toString());
		}
		
		Hashtable table=new Hashtable();
		table.put(null, "sb");
		System.out.println(table.get(null));
	}

}
