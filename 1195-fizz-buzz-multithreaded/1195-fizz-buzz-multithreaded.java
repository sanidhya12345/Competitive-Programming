class FizzBuzz {
     private volatile int n,cnt;
    Semaphore s1,s2,s3,s4;
    
    public FizzBuzz(int n) {
        this.n = n;
        cnt = 1;
        s1 = new Semaphore(0);
        s2 = new Semaphore(0);
        s3 = new Semaphore(0);
        s4 = new Semaphore(1);
    }

 
    public void fizz(Runnable printFizz) throws InterruptedException {
        while(cnt<=n){
            s1.acquire();
            if(cnt>n){
                break;
            }
            printFizz.run();
            cnt++;
            if(cnt%5!=0){
                s4.release();
            } else{
                s2.release();
            }
        }
        s2.release();
        s3.release();
        s4.release();
    }

    public void buzz(Runnable printBuzz) throws InterruptedException {
        while(cnt<=n){
            s2.acquire();
            if(cnt>n){
                break;
            }
            printBuzz.run();
            cnt++;
            if(cnt%3!=0){
                s4.release();
            } else{
                s1.release();
            }
        }
        s1.release();
        s3.release();
        s4.release();
    }

    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while(cnt<=n){
            s3.acquire();
            if(cnt>n){
                break;
            }
            printFizzBuzz.run();
            cnt++;
            s4.release();
        }
        s1.release();
        s2.release();
        s4.release();
    }

    public void number(IntConsumer printNumber) throws InterruptedException {
        while(cnt<=n){
            s4.acquire();
            if(cnt%3!=0 && cnt%5!=0){
                if(cnt>n){
                    break;
                }
                printNumber.accept(cnt);
                cnt++;
                if(cnt%3!=0 && cnt%5!=0){
                    s4.release();
                } else if(cnt%3!=0){
                    s2.release();
                } else if(cnt%5!=0){
                    s1.release();
                } else{
                    s3.release();
                }
            } else if(cnt%3!=0){
                s2.release();
            } else if(cnt%5!=0){
                s1.release();
            } else{
                s3.release();
            }
        }
        s1.release();
        s2.release();
        s3.release();
    }
}