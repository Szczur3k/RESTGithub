package pl.MateuszLukaszczyk.RESTGithub.domain;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.MateuszLukaszczyk.RESTGithub.dto.GitOwnerDto;
import pl.MateuszLukaszczyk.RESTGithub.dto.GitOwnerAllReposDto;
import pl.MateuszLukaszczyk.RESTGithub.dto.GitOwnerRepo;

@Component
public class HttpClient {

    RestTemplate restTemplate = new RestTemplate();
    String resourceUrl = "https://api.github.com/users/defunkt";
    static final String USER_ALL_REPOS = "https://api.github.com/users/";
    static final String USER_REPO = "https://api.github.com/repos/";

    public GitOwnerDto getResponse(){
        return restTemplate.getForObject(resourceUrl, GitOwnerDto.class);
    }

    public GitOwnerRepo[] getAllReposFromUser(String owner) {
        return restTemplate.getForObject(USER_ALL_REPOS + "{owner}/repos",
                GitOwnerRepo[].class,
                owner);
    }

    public GitOwnerRepo getGivenRepoFromUser(String owner, String repositoryName) {
        return restTemplate.getForObject("https://api.github.com/repos/{owner}/{repositoryName}",
                GitOwnerRepo.class,
                owner,
                repositoryName);
    }
}
