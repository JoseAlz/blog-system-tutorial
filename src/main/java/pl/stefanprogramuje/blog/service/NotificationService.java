package pl.stefanprogramuje.blog.service;

public interface NotificationService {

    void addInfoMessage(String msg);
    void addErrorMessage(String msg);
}
