package pt.pa.model;

import java.util.List;

public class AverageGrade implements Statistic{
    @Override
    public double compute(List<StudentGrade> grades) {
        double av = 0.0;
        if(grades.isEmpty())
            return -1;

        for (StudentGrade grade : grades) {
            av += grade.getGrade();
        }
        av = (av * 1.0) / grades.size();
        return av;
    }
}
