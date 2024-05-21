package _2023._012_Dec;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author Xu Shen
 * @Date 2023/12/21 11:48
 * @Version 1.0
 * @DESC :
 */
public class test_1221 {
    private String value;
    private LocalDate date;

    public test_1221(String value, LocalDate date) {
        this.value = value;
        this.date = date;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public static void main(String[] args) {
        List<test_1221> dataList = new ArrayList<>();
        dataList.add(new test_1221("A", LocalDate.of(2022, 1, 15)));
        dataList.add(new test_1221("B", LocalDate.of(2022, 2, 10)));
        dataList.add(new test_1221("C", LocalDate.of(2022, 1, 20)));
        dataList.add(new test_1221("D", LocalDate.of(2022, 2, 5)));

        Map<String, List<test_1221>> groupedData = dataList.stream()
                .collect(Collectors.groupingBy(data -> data.getDate().format(DateTimeFormatter.ofPattern("yyyy-MM"))));

        System.out.println("按月份分组的数据：");
        for (Map.Entry<String, List<test_1221>> entry : groupedData.entrySet()) {
            System.out.println("月份：" + entry.getKey());
            for (test_1221 data : entry.getValue()) {
                System.out.println("值：" + data.getValue());
            }
        }
    }
}
