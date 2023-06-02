import java.util.LinkedList;
import java.util.List;

public class DateNextDateExceptionTest {
    private List<Integer[]> date;

    public DateNextDateExceptionTest() {
        this.date = this.data();
    }

    private List<Integer[]> data() {
        List<Integer[]> date = new LinkedList<Integer[]>();
        date.add(new Integer[] { 1500, 2, 31 });
        date.add(new Integer[] { 1500, 02, 29 });
        date.add(new Integer[] { -1, 10, 20 });
        date.add(new Integer[] { -1, 10, 20 });
        date.add(new Integer[] { 1975, 6, -50 });
        return date;
    }

    public Integer[] testDateEx(int count) {
        return date.get(count);
    }

}