package com.bladcode.moviestart.moviestart_api.service.serviceImp;

import com.bladcode.moviestart.moviestart_api.client.VimeusClient;
import com.bladcode.moviestart.moviestart_api.dtos.ApiResponse;
import com.bladcode.moviestart.moviestart_api.dtos.MovieListResponse;
import com.bladcode.moviestart.moviestart_api.service.MovieService;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import java.util.Date;

@Service
public class MovieServiceImp implements MovieService {

    private  final VimeusClient vimeusClient;

    public MovieServiceImp(VimeusClient vimeusClient) {
        this.vimeusClient = vimeusClient;
    }

    @Override
    public ApiResponse<MovieListResponse> listMoviePage(int page) {

        System.out.println("Consultando pagina: "+ page);
        ApiResponse<MovieListResponse> responseApiResponse = vimeusClient.getMovies(page);

        if(responseApiResponse.getError()){
            throw new RuntimeException("Error obteniendo peliculas");
        }


        return responseApiResponse;
    }

    @Override
    public StreamingResponseBody streamMovie(String id) {


        return null;
    }
}
