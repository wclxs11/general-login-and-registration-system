//package com.example.myproject.cache;
//
//
//@Component
//public class CacheService {
//	  private Map<String,String> maps = new ConcurrentHashMap<>();
//	    @Autowired
//	    private UrlLibraryRepository urlLibraryRepository;
//
//	    public String getMap(String key){
//	        if(maps.isEmpty()){
//	           List<UrlLibrary> collectLibrarieList = urlLibraryRepository.findAll();
//	            for(UrlLibrary urlLibrary : collectLibrarieList){
//	                maps.put(urlLibrary.getUrl(), urlLibrary.getLogoUrl());
//	            }
//	        }
//	        if(null == maps.get(key)){
//	            this.addMaps(key);
//	        }
//	        return maps.get(key);
//	    }
//
//
//	    public void addMaps(String key){
//	        if(key.contains("?")){
//	            key=key.substring(0,key.indexOf("?"));
//	        }
//	        String logoUrl = HtmlUtil.getImge(key);
//	        maps.put(key,logoUrl);
//	        UrlLibrary urlLibrary = new UrlLibrary();
//	        urlLibrary.setUrl(key);
//	        urlLibrary.setLogoUrl(logoUrl);
//	        urlLibraryRepository.save(urlLibrary);
//	    }
//
//	    public boolean refreshOne(String key,String newValue){
//	        if(StringUtils.isNotBlank(key)){
//	            String value = getMap(key);
//	            if(StringUtils.isNotBlank(newValue) && !newValue.equals(value)){
//	                maps.put(key,newValue);
//	                return true;
//	            }
//	        }
//	        return false;
//	    }
//}
