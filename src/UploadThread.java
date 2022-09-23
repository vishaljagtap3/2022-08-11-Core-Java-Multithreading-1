public class UploadThread extends Thread {

    private String filePath;

    public UploadThread(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        for(int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException ie) {}
            System.out.println("Upload " + filePath + " : " + i + "%");
        }
    }
}
