package pl.MateuszLukaszczyk.RESTGithub.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GitOwnerRepo {

    private String full_name;
    private String description;
    private String clone_url;
    private int stargazers_count;
    private String created_at;
}
