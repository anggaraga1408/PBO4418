public class TV{
    int channel, volumeLevel;
    boolean on;

    public TV(){
        channel = 1;
        volumeLevel = 1;
        on = false;
    }

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void setChannel(int newChannel){
        if(channel <= 120 && channel >=1){
            channel = newChannel;
        }else{
            System.out.println("The current channel is from 1 up to 120");
        }
    }

    public void setVolume(int newVolume){
        if(volumeLevel <= 7 && volumeLevel >=1){
            volumeLevel = newVolume;
        }else{
            System.out.println("The current volume is from 1 up to 7");
        }
    }

    public void channelUp(){
        channel++;
        if(channel > 120){
            channel = 1;
            System.out.println("Channel up exceeded 120, go back to 1");
        }
    }

    public void channelDown(){
        channel--;
        if(channel < 1){
            channel = 120;
            System.out.println("Channel down exceeded 1, go back to 120");
        }
    }

    public void volumeUp(){
        volumeLevel++;
        if(volumeLevel > 7){
            System.out.println("Volume MAX");
            volumeLevel = 7;
        }
    }

    public void volumeLevel(){
        volumeLevel--;
        if(volumeLevel < 1){
            System.out.println("Volume MIN");
            volumeLevel = 1;
        }
    }
}