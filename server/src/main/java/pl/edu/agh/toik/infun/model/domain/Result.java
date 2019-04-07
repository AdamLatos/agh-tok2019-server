package pl.edu.agh.toik.infun.model.domain;

import lombok.Data;

import java.util.List;

@Data
public class Result {
    private float score;
    private List<String> availableTasks;
    private int completedNumber;

    public Result(List<String> tasks) {
        this.score = 0.0F;
        this.availableTasks = tasks;
        this.completedNumber = 0;
    }

    public void addUserResult(float result) {
        this.score += result;
    }


}
