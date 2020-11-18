package pt.pa.model;

import java.util.List;

public class HighestGrade implements Statistic{

    @Override
    public double compute(List<StudentGrade> grades) {
        int highestGrade = grades.get(0).getGrade();

        if(grades.isEmpty())
            return -1;

        for (StudentGrade grade : grades) {
            if(highestGrade < grade.getGrade())
                highestGrade = grade.getGrade();
        }

        return highestGrade * 1.0;
    }
}
