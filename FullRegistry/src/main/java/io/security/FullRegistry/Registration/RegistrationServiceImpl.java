package io.security.FullRegistry.Registration;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j @RequiredArgsConstructor
public class RegistrationServiceImpl implements RegistrationService {

    @Override
    public String register(RegistrationUserRequest request) {
        return "Foi";
    }
}
