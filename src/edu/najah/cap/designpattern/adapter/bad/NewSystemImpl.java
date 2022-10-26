package edu.najah.cap.designpattern.adapter.bad;

public class NewSystemImpl implements NewSystem {
    @Override
    public Result getResult() {

        return process();
    }


    private Result process() {
        System.out.println("processing .... ");
        //logic
        Result result = new Result(123, "Ahmad");
        return result;
    }
}
