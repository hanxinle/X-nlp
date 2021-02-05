//mavendemo演示了如何利用maven配置hanlp包，还有另一种方法

package mavendemo;
import com.hankcs.hanlp.HanLP;


public class mavendemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.print(HanLP.segment("你好，欢迎使用我的开发包"));
	}
}


