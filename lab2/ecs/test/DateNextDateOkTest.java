import java.util.LinkedList;
import java.util.List;

public class DateNextDateOkTest {
    private List<Date> date;

    public DateNextDateOkTest() {
        this.date = this.data();
    }

    private List<Date> data() {
        List<Date> date = new LinkedList<Date>();
        date.add(new Date(1700, 6, 20));
        date.add(new Date(2005, 4, 15));
        date.add(new Date(1901, 7, 20));
        date.add(new Date(3456, 3, 27));
        date.add(new Date(1500, 2, 17));
        date.add(new Date(1700, 6, 29));
        date.add(new Date(1800, 11, 29));
        date.add(new Date(3453, 1, 29));
        date.add(new Date(444, 2, 29));
        date.add(new Date(2005, 4, 30));
        date.add(new Date(3453, 1, 30));
        date.add(new Date(3456, 3, 30));
        date.add(new Date(1901, 7, 31));
        date.add(new Date(3453, 1, 31));
        date.add(new Date(3456, 12, 31));
        return date;
    }

    public Date testDateOk(int count) {
        Date date1 = date.get(count);
        return date1;
    }
}