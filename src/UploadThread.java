public class UploadThread extends Thread {

    private String filePath;

    public UploadThread(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {

        Thread thread = Thread.currentThread();
        System.out.println("*** " + thread.getName() + " --- " + thread.getPriority());

        for(int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException ie) {}
            System.out.println("Upload " + filePath + " : " + i + "%");
        }
    }
}
