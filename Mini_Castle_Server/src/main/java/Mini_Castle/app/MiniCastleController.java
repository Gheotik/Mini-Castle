package Mini_Castle.app;

import java.util.List;

import Mini_Castle.app.entity.Card;
import Mini_Castle.app.model.repository.Mini_CastleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
@RequestMapping("api/card")

public class MiniCastleController {
    private final Mini_CastleRepository repository;

    @GetMapping
    public List<Card> listAll(){ return  repository.findAllByOrderByIdAsc();}


}
