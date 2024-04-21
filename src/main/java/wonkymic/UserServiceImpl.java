package wonkymic;

import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;
import user.UserOuterClass.User;
import user.UserOuterClass.UserDetailRequest;
import user.UserOuterClass.UserDetailResponse;
 import user.UserService;

@GrpcService
public class UserServiceImpl implements UserService {
    @Override
    public Uni<UserDetailResponse> getUserDetails(UserDetailRequest request) {
        User user = User.newBuilder()
            .setId(request.getId())
            .setName("Wonky Mic")
            .setEmail("test.wonky@mail.com")
            .setPhone("123-456-7890")
            .build();

        UserDetailResponse response = UserDetailResponse.newBuilder()
                .setUser(user)
                .build();

        return Uni.createFrom().item(response);
    }
}
