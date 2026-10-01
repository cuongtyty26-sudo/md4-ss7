package exam.ss7.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDTO {

    @NotBlank(message = "Họ tên không được để trống")
    @Size(min = 2, max = 50, message = "Họ tên phải từ 2 đến 50 ký tự")
    private String fullName;

    @NotBlank(message = "Email không được để trống")
    @Email(message = "Email không đúng định dạng")
    private String email;

    @NotNull(message = "Tuổi không được để trống")
    @Min(value = 18, message = "Sinh viên phải từ 18 tuổi trở lên")
    private Integer age;

    @NotNull(message = "GPA không được để trống")
    @Min(value = 0, message = "GPA không được nhỏ hơn 0")
    @Max(value = 10, message = "GPA không được lớn hơn 10")
    private Double gpa;

    @NotBlank(message = "Mã sinh viên không được để trống")
    @Pattern(
            regexp = "^SV\\d{4}$",
            message = "Mã sinh viên phải có dạng SV + 4 chữ số"
    )
    private String studentCode;
}