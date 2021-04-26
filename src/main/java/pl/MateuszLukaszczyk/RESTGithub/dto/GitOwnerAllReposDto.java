package pl.MateuszLukaszczyk.RESTGithub.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GitOwnerAllReposDto {

    private String full_name;
    private String description;
    private String clone_url;
    private int stargazers_count;
    private String created_at;

}
