public class TestTV{
    public static void main(String[] args){
        TV politron = new TV();
        politron.turnOn();
        politron.setChannel(30);
        politron.setVolume(3);

        TV samsung = new TV();
        samsung.turnOn();
        samsung.channelUp();
        samsung.channelUp();
        samsung.volumeUp();

        System.out.println("TV Politron channel is "+politron.channel+" and volume level is "+politron.volumeLevel);
        System.out.println("TV Samsung channel is "+samsung.channel+" and volume level is "+samsung.volumeLevel);
    }
}