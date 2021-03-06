package com.example.prefetch_recyclerview;

import java.util.List;

public abstract class TiktokDataModel {


    private List<Msg> msg;
    private String code;

    public List<Msg> getMsg() {
        return msg;
    }

    public void setMsg(List<Msg> msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static class Msg {
        private String created;
        private Sound sound;
        private String description;
        private String privacy_type;
        private String gif;
        private String thum;
        private String video;
        private String liked;
        private Count count;
        private User_info user_info;
        private String fb_id;
        private String id;

        public Msg(String created, String description, String privacy_type, String gif, String thum, String video, String liked, String fb_id, String id) {
            this.created = created;
            this.description = description;
            this.privacy_type = privacy_type;
            this.gif = gif;
            this.thum = thum;
            this.video = video;
            this.liked = liked;
            this.fb_id = fb_id;
            this.id = id;
        }

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        public Sound getSound() {
            return sound;
        }

        public void setSound(Sound sound) {
            this.sound = sound;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPrivacy_type() {
            return privacy_type;
        }

        public void setPrivacy_type(String privacy_type) {
            this.privacy_type = privacy_type;
        }

        public String getGif() {
            return gif;
        }

        public void setGif(String gif) {
            this.gif = gif;
        }

        public String getThum() {
            return thum;
        }

        public void setThum(String thum) {
            this.thum = thum;
        }

        public String getVideo() {
            return video;
        }

        public void setVideo(String video) {
            this.video = video;
        }

        public String getLiked() {
            return liked;
        }

        public void setLiked(String liked) {
            this.liked = liked;
        }

        public Count getCount() {
            return count;
        }

        public void setCount(Count count) {
            this.count = count;
        }

        public User_info getUser_info() {
            return user_info;
        }

        public void setUser_info(User_info user_info) {
            this.user_info = user_info;
        }

        public String getFb_id() {
            return fb_id;
        }

        public void setFb_id(String fb_id) {
            this.fb_id = fb_id;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    public static class Sound {
        private String created;
        private String section;
        private String thum;
        private String description;
        private String sound_name;
        private Audio_path audio_path;
        private String id;

        public Sound(String created, String section, String thum, String description, String sound_name, Audio_path audio_path, String id) {
            this.created = created;
            this.section = section;
            this.thum = thum;
            this.description = description;
            this.sound_name = sound_name;
            this.audio_path = audio_path;
            this.id = id;
        }

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        public String getSection() {
            return section;
        }

        public void setSection(String section) {
            this.section = section;
        }

        public String getThum() {
            return thum;
        }

        public void setThum(String thum) {
            this.thum = thum;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getSound_name() {
            return sound_name;
        }

        public void setSound_name(String sound_name) {
            this.sound_name = sound_name;
        }

        public Audio_path getAudio_path() {
            return audio_path;
        }

        public void setAudio_path(Audio_path audio_path) {
            this.audio_path = audio_path;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    public static class Audio_path {
        private String acc;
        private String mp3;

        public String getAcc() {
            return acc;
        }

        public void setAcc(String acc) {
            this.acc = acc;
        }

        public String getMp3() {
            return mp3;
        }

        public void setMp3(String mp3) {
            this.mp3 = mp3;
        }
    }

    public static class Count {
        private String video_comment_count;
        private String like_count;

        public String getVideo_comment_count() {
            return video_comment_count;
        }

        public void setVideo_comment_count(String video_comment_count) {
            this.video_comment_count = video_comment_count;
        }

        public String getLike_count() {
            return like_count;
        }

        public void setLike_count(String like_count) {
            this.like_count = like_count;
        }
    }

    public static class User_info {
        private String profile_pic;
        private String username;
        private String last_name;
        private String first_name;

        public String getProfile_pic() {
            return profile_pic;
        }

        public void setProfile_pic(String profile_pic) {
            this.profile_pic = profile_pic;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }
    }
}