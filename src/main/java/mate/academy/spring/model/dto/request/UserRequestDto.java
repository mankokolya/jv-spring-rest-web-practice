package mate.academy.spring.model.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import mate.academy.spring.validation.PasswordMatch;

@PasswordMatch
public class UserRequestDto {
    @Email
    @NotNull(message = "This field is obligatory")
    private String email;
    @NotNull(message = "This field is obligatory")
    @NotBlank
    @Size(min = 4)
    private String password;
    @NotNull(message = "This field is obligatory")
    @NotBlank
    @Size(min = 4)
    private String repeatPassword;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }
}