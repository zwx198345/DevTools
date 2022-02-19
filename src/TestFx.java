import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Sun
 * @Date: 2022/2/19 - 02 - 19 - 20:03
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestFx {
    public static void main(String[] args) {
        T text = new T();
        text.a(new ArrayList<Integer>());
        text.a(new ArrayList<String>());
        text.a(new ArrayList<Double>());
        text.a(new ArrayList<Float>());
    }
}

class T {
    public void a(List<?> list) {
        for (Object a : list) {
            System.out.println(a);
        }
    }
}