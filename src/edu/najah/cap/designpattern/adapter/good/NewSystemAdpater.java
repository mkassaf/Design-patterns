package edu.najah.cap.designpattern.adapter.good;

public class NewSystemAdpater implements NewSystem {

    private final LegacySystem legacySystem;

    public NewSystemAdpater(LegacySystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public Result getResult() {
        //we convert the result from legacy system to the new system
        String result = legacySystem.getStringResult();//Ahmad:195
        String[] split = result.split(":");
        Result result1 = new Result();
        result1.setId(Integer.parseInt(split[1]));
        result1.setName(split[0]);
        return result1;
    }
}
