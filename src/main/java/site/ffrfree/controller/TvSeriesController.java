package site.ffrfree.controller;

import site.ffrfree.TvSeriesDto;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/tvseries")
public class TvSeriesController {
    private static final Log log = LogFactory.getLog(TvSeriesController.class);


    @GetMapping
    public List<TvSeriesDto> getAll(){
        if(log.isTraceEnabled()){
            log.trace("getAll()被调用了");
        }
        ArrayList<TvSeriesDto> list = new ArrayList<>();
        list.add(createPoi());
        list.add(createWestWorld());
        return list;
    }

    @GetMapping("/{id}")
    public TvSeriesDto getOne(@PathVariable int id){
        if(log.isTraceEnabled()){
            log.trace("getOne "+id);
        }
        if(id==101){
            return createPoi();
        }else if(id==102){
            return createWestWorld();
        }else{
            throw new ResourceNotFoundException();
        }
    }

    /**
     * @Valid 注解表示需要验证传入的参数TvSeriesDto，需要验证的field在TvSeriesDto内通过注解定义（@NotNull, @DecimalMin等）
     * @param tvSeriesDto
     * @return
     */
    @PostMapping
    public TvSeriesDto insertOne(@RequestBody(required = false) TvSeriesDto tvSeriesDto) {
        if(log.isTraceEnabled()) {
            log.trace("这里应该写新增tvSeriesDto到数据库的代码, 传递进来的参数是：" + tvSeriesDto);
        }
        //TODO:在数据
        tvSeriesDto.setId(9999);
        return tvSeriesDto;
    }

    @PutMapping("/{id}")
    public TvSeriesDto updateOne(@PathVariable int id, @RequestBody TvSeriesDto tvSeriesDto){
        if(log.isTraceEnabled()) {
            log.trace("updateOne " + id);
        }
        if(id == 101 || id == 102) {
            //TODO: 根据tvSeriesDto的内容更新数据库，更新后返回新
            return createPoi();
        }else {
            throw new ResourceNotFoundException();
        }
    }

    /**
     * 创建电视剧“Person of Interest",仅仅方便此节做展示其他方法用，以后章节把数据存储到数据库后，会删除此方法
     */
    private TvSeriesDto createPoi() {
        Calendar c = Calendar.getInstance();
        c.set(2011, Calendar.SEPTEMBER, 22, 0, 0, 0);
        return new TvSeriesDto(102, "Person of Interest", 5, c.getTime());
    }
    /**
     * 创建电视剧“West World",仅仅方便此节做展示其他方法用，以后章节把数据存储到数据库后，会删除此方法
     */
    private TvSeriesDto createWestWorld() {
        Calendar c = Calendar.getInstance();
        c.set(2016, Calendar.OCTOBER, 2, 0, 0, 0);
        return new TvSeriesDto(101, "West World", 1, c.getTime());
    }
}
