package com.example.departmentmanager.service;

import com.cloudinary.Cloudinary;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Set;
@Service
@RequiredArgsConstructor
public class FileStorageServiceImpl implements FileStorageService{

    private static final long MAX_FILE_SIZE  = 2* 1024 *1024 ;
    private static final Set<String> ALLOWED_EXTENSIONS = Set.of("jpg", "jpeg", "png") ;
    private final Cloudinary cloudinary;
    @Override
    public String uploadImage(MultipartFile file) {
        return "";
    }
}
