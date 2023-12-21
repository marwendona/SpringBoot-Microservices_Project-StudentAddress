package tn.iit.studentservice.decoder;

import feign.Response;
import feign.codec.ErrorDecoder;
import tn.iit.studentservice.exception.AdressNotFoundException;

public class CustomErrorDecoder implements ErrorDecoder {
    private final ErrorDecoder defaultErrorDecoder = new Default();
    @Override
    public Exception decode(String invoqueur, Response reponse) {
        if(reponse.status() == 400 ) {
            throw new AdressNotFoundException("Requête incorrecte");
        }
        return defaultErrorDecoder.decode(invoqueur, reponse);
    }
}
