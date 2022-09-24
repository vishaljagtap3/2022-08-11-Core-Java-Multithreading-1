public class DownloadThread extends Thread {

    private String url;

    public DownloadThread(String url) {
        this.url = url;
    }

    @Override
    public void run() {

        Thread thread = Thread.currentThread();
        System.out.println("**** " + thread.getName()  + " --- " + thread.getPriority());

        for(int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException ie) {}

            System.out.println("Download " + url + ": " + i  +"%");
        }
    }

}
