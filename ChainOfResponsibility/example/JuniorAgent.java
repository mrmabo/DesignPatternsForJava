package ChainOfResponsibility.example;

import sun.misc.Request;

public class JuniorAgent extends AbstractAgent {

    @Override
    public void handleRequest(Request req) {
        if ( this.canHandleRequest(req) ){
            //handle this request
//            req.setAnswered(true);
            return;
        }else{
            if ( this.nextAgent != null ) this.nextAgent.handleRequest(req);
        }
    }
}
