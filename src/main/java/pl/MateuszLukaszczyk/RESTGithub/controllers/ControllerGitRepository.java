package pl.MateuszLukaszczyk.RESTGithub.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.MateuszLukaszczyk.RESTGithub.domain.HttpClient;
import pl.MateuszLukaszczyk.RESTGithub.dto.GitOwnerRepo;

@RestController("/")
public class ControllerGitRepository {

    HttpClient httpClient;

    public ControllerGitRepository(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    @GetMapping
    public String whichUserYouCanEndPoint(){
        return "write one of the following users: defunkt, octocat";
    }

    @GetMapping("/repositories/{owner}")
    public GitOwnerRepo[] getAllRepositoriesFromUser(@PathVariable String owner){
        return httpClient.getAllReposFromUser(owner);
    }

    @GetMapping("/repositories/{owner}/{repositoryName}")
    public GitOwnerRepo getRepository(@PathVariable String owner,
                                        @PathVariable String repositoryName) throws Exception {
        return httpClient.getGivenRepoFromUser(owner, repositoryName);
    }


}
