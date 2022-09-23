public class DownloadThread extends Thread {

    private String url;

    public DownloadThread(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        for(int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException ie) {}

            System.out.println("Download " + url + ": " + i  +"%");
        }
    }

}
