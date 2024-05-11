package cn.xmu.changgu;

public class SystemAdapter implements MusicPlayerInterface, SmartHomeInterface {
    private MusicPlayer musicPlayer;
    private SmartHome smartHome;

    public SystemAdapter(MusicPlayer musicPlayer, SmartHome smartHome) {
        this.musicPlayer = musicPlayer;
        this.smartHome = smartHome;
    }

    public void playMusic() {
        smartHome.turnOnLights();
    }

    public void stopMusic() {
        smartHome.turnOffLights();
    }

    public void turnOnLights() {
        musicPlayer.playMusic();
    }

    public void turnOffLights() {
        musicPlayer.stopMusic();
    }
}
