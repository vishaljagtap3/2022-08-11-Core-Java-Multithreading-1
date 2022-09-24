public class Main {
    public static void main(String[] args) {

        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + " " + thread.getPriority());

        DownloadThread d1 = new DownloadThread("https://bitcode.in/java/iwillnotdoasssignment.studnet");
        d1.setName("D1 Download Thread");
        d1.setPriority(10);

        UploadThread u1 = new UploadThread("ineedajobwithnoworkbutexcellentsal.pdf");
        u1.setName("U1 Upload Thread");

        DownloadThread d2 = new DownloadThread("https://bitcode.in/java/demos.zip");
        d2.setName("D2 Download Thread");
        d2.start();

        d1.start();
        u1.start();

        //not a good way
       /* while(d1.isAlive() || d2.isAlive() || u1.isAlive()) {
        }*/

        //the thread which executed the join method will pause here
        //the paused thread will continue execution once the thread whose join method is executed has finished the execution

        try {
            d1.join();
            d2.join();
            u1.join();
        }
        catch(InterruptedException ie) {
        }


        System.out.println("Download and upload operations are done....");
        System.out.println("End of main");

        /*for(int i = 0; i <= 100; i++) {
            *//*try {
                Thread.sleep(100);
            }
            catch (InterruptedException ie) {}*//*
            System.out.println("main " + i);
        }
*/
    }
}
