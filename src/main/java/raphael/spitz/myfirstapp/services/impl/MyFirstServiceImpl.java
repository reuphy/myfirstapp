package raphael.spitz.myfirstapp.services.impl;

import org.springframework.stereotype.Service;
import raphael.spitz.myfirstapp.services.MyFirstService;

@Service
public class MyFirstServiceImpl implements MyFirstService {
    @Override
    public String myServiceMethod() {
        return "hello Mama";
    }
}
