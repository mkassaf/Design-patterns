package edu.najah.cap.designpattern.adapter.good;

public class NewSystemAdpater implements NewSystem {

    private LegacySystem legacySystem;

    public NewSystemAdpater() {
        this.legacySystem = new LegacySystem();
    }

    @Override
    public Result getResult() {
        String strResult = legacySystem.getStringResult();
        //From string to Result object
        String[] arrayOfString= strResult.split(":");
        //validate arrayOfString
        Result result = new Result();
        result.setId(Integer.parseInt(arrayOfString[1]));
        result.setName(arrayOfString[0]);
        return result;
    }
}
