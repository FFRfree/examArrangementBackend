import org.junit.Test;

public class LanguageTest {
    enum Color{
        RED("红色",1),Green("绿色",2);
        private String name;
        private int index;
        private Color(String name,int index){
            this.name = name;
            this.index = index;
        }

        @Override
        public String toString() {
            return "Color{" +
                    "name='" + name + '\'' +
                    ", index=" + index +
                    '}';
        }
    }
    @Test
    public static void main(String[] args) {
        Color c1 = Color.valueOf("RED");
        System.out.println(c1);
    }
}
