package edu.najah.cap.designpattern.adapter.good;

public class NewSystemAdpaterViInhertance extends LegacySystem implements NewSystem {


    @Override
    public Result getResult() {
        String strResult = this.getStringResult();
        //result values need to be converted to another format.
        //From string to Result object
        String[] arrayOfString= strResult.split(":");
        //validate arrayOfString
        Result result = new Result();
        result.setId(Integer.parseInt(arrayOfString[1]));
        result.setName(arrayOfString[0]);
        return result;
    }

    /**
     * This function is not required since no need to override it
     * @return
     */
    @Override
    public String getStringResult(){
        //this.getStringResult();//
        return super.getStringResult();
    }



}
