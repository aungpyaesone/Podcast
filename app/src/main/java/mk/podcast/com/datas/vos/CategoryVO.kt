package mk.podcast.com.datas.vos

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "category")
data class CategoryVO(
    @PrimaryKey
    @SerializedName("id") var id: Int=0,
    @SerializedName("image") var image: String="",
    @SerializedName("title") var title: String="",
)