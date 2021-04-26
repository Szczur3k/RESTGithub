package pl.MateuszLukaszczyk.RESTGithub.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GitOwnerDto {
    private String login;
    private String url;
    private String repos_url;

}
