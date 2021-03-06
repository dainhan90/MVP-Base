package vmodev.base.repository;

import android.content.Context;

import java.util.List;

import rx.Observable;
import vmodev.base.repository.enity.Profile;

/**
 * Created by thanhle on 8/2/16.
 */
public interface IDataSource {
    Observable<Profile> login(String email, String password);
}
